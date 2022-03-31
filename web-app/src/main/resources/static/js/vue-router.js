(function(global,factory){typeof exports==='object'&&typeof module!=='undefined'?module.exports=factory():typeof define==='function'&&define.amd?define(factory):(global.VueRouter=factory());}(this,(function(){'use strict';function assert(condition,message){if(!condition){throw new Error(("[vue-router] "+message))}}
function warn(condition,message){if("development"!=='production'&&!condition){typeof console!=='undefined'&&console.warn(("[vue-router] "+message));}}
var View={name:'router-view',functional:true,props:{name:{type:String,default:'default'}},render:function render(h,ref){var props=ref.props;var children=ref.children;var parent=ref.parent;var data=ref.data;data.routerView=true;var name=props.name;var route=parent.$route;var cache=parent._routerViewCache||(parent._routerViewCache={});var depth=0;var inactive=false;while(parent){if(parent.$vnode&&parent.$vnode.data.routerView){depth++;}
if(parent._inactive){inactive=true;}
parent=parent.$parent;}
data.routerViewDepth=depth;if(inactive){return h(cache[name],data,children)}
var matched=route.matched[depth];if(!matched){cache[name]=null;return h()}
var component=cache[name]=matched.components[name];data.registerRouteInstance=function(vm,val){if(matched.instances[name]!==vm){matched.instances[name]=val;}};data.props=resolveProps(route,matched.props&&matched.props[name]);return h(component,data,children)}};function resolveProps(route,config){switch(typeof config){case 'undefined':return
case 'object':return config
case 'function':return config(route)
case 'boolean':return config?route.params:undefined
default:{warn(false,"props in \""+(route.path)+"\" is a "+(typeof config)+", "+
"expecting an object, function or boolean.");}}}
var encodeReserveRE=/[!'()*]/g;var encodeReserveReplacer=function(c){return '%'+c.charCodeAt(0).toString(16);};var commaRE=/%2C/g;var encode=function(str){return encodeURIComponent(str).replace(encodeReserveRE,encodeReserveReplacer).replace(commaRE,',');};var decode=decodeURIComponent;function resolveQuery(query,extraQuery,_parseQuery){if(extraQuery===void 0)extraQuery={};var parse=_parseQuery||parseQuery;var parsedQuery;try{parsedQuery=parse(query||'');}catch(e){"development"!=='production'&&warn(false,e.message);parsedQuery={};}
for(var key in extraQuery){var val=extraQuery[key];parsedQuery[key]=Array.isArray(val)?val.slice():val;}
return parsedQuery}
function parseQuery(query){var res={};query=query.trim().replace(/^(\?|#|&)/,'');if(!query){return res}
query.split('&').forEach(function(param){var parts=param.replace(/\+/g,' ').split('=');var key=decode(parts.shift());var val=parts.length>0?decode(parts.join('=')):null;if(res[key]===undefined){res[key]=val;}else if(Array.isArray(res[key])){res[key].push(val);}else{res[key]=[res[key],val];}});return res}
function stringifyQuery(obj){var res=obj?Object.keys(obj).map(function(key){var val=obj[key];if(val===undefined){return ''}
if(val===null){return encode(key)}
if(Array.isArray(val)){var result=[];val.slice().forEach(function(val2){if(val2===undefined){return}
if(val2===null){result.push(encode(key));}else{result.push(encode(key)+'='+encode(val2));}});return result.join('&')}
return encode(key)+'='+encode(val)}).filter(function(x){return x.length>0;}).join('&'):null;return res?("?"+res):''}
var trailingSlashRE=/\/?$/;function createRoute(record,location,redirectedFrom,router){var stringifyQuery$$1=router&&router.options.stringifyQuery;var route={name:location.name||(record&&record.name),meta:(record&&record.meta)||{},path:location.path||'/',hash:location.hash||'',query:location.query||{},params:location.params||{},fullPath:getFullPath(location,stringifyQuery$$1),matched:record?formatMatch(record):[]};if(redirectedFrom){route.redirectedFrom=getFullPath(redirectedFrom,stringifyQuery$$1);}
return Object.freeze(route)}
var START=createRoute(null,{path:'/'});function formatMatch(record){var res=[];while(record){res.unshift(record);record=record.parent;}
return res}
function getFullPath(ref,_stringifyQuery){var path=ref.path;var query=ref.query;if(query===void 0)query={};var hash=ref.hash;if(hash===void 0)hash='';var stringify=_stringifyQuery||stringifyQuery;return(path||'/')+stringify(query)+hash}
function isSameRoute(a,b){if(b===START){return a===b}else if(!b){return false}else if(a.path&&b.path){return(a.path.replace(trailingSlashRE,'')===b.path.replace(trailingSlashRE,'')&&a.hash===b.hash&&isObjectEqual(a.query,b.query))}else if(a.name&&b.name){return(a.name===b.name&&a.hash===b.hash&&isObjectEqual(a.query,b.query)&&isObjectEqual(a.params,b.params))}else{return false}}
function isObjectEqual(a,b){if(a===void 0)a={};if(b===void 0)b={};var aKeys=Object.keys(a);var bKeys=Object.keys(b);if(aKeys.length!==bKeys.length){return false}
return aKeys.every(function(key){return String(a[key])===String(b[key]);})}
function isIncludedRoute(current,target){return(current.path.replace(trailingSlashRE,'/').indexOf(target.path.replace(trailingSlashRE,'/'))===0&&(!target.hash||current.hash===target.hash)&&queryIncludes(current.query,target.query))}
function queryIncludes(current,target){for(var key in target){if(!(key in current)){return false}}
return true}
var toTypes=[String,Object];var eventTypes=[String,Array];var Link={name:'router-link',props:{to:{type:toTypes,required:true},tag:{type:String,default:'a'},exact:Boolean,append:Boolean,replace:Boolean,activeClass:{type:String,default:'router-link-active'},event:{type:eventTypes,default:'click'}},render:function render(h){var this$1=this;var router=this.$router;var current=this.$route;var ref=router.resolve(this.to,current,this.append);var location=ref.location;var route=ref.route;var href=ref.href;var classes={};var globalActiveClass=router.options.linkActiveClass;var activeClass=globalActiveClass==null?this.activeClass:globalActiveClass;var compareTarget=location.path?createRoute(null,location,null,router):route;classes[activeClass]=this.exact?isSameRoute(current,compareTarget):isIncludedRoute(current,compareTarget);var handler=function(e){if(guardEvent(e)){if(this$1.replace){router.replace(location);}else{router.push(location);}}};var on={click:guardEvent};if(Array.isArray(this.event)){this.event.forEach(function(e){on[e]=handler;});}else{on[this.event]=handler;}
var data={class:classes};if(this.tag==='a'){data.on=on;data.attrs={href:href};}else{var a=findAnchor(this.$slots.default);if(a){a.isStatic=false;var extend=_Vue.util.extend;var aData=a.data=extend({},a.data);aData.on=on;var aAttrs=a.data.attrs=extend({},a.data.attrs);aAttrs.href=href;}else{data.on=on;}}
return h(this.tag,data,this.$slots.default)}};function guardEvent(e){if(e.metaKey||e.ctrlKey||e.shiftKey){return}
if(e.defaultPrevented){return}
if(e.button!==undefined&&e.button!==0){return}
if(e.currentTarget&&e.currentTarget.getAttribute){var target=e.currentTarget.getAttribute('target');if(/\b_blank\b/i.test(target)){return}}
if(e.preventDefault){e.preventDefault();}
return true}
function findAnchor(children){if(children){var child;for(var i=0;i<children.length;i++){child=children[i];if(child.tag==='a'){return child}
if(child.children&&(child=findAnchor(child.children))){return child}}}}
var _Vue;function install(Vue){if(install.installed){return}
install.installed=true;_Vue=Vue;Object.defineProperty(Vue.prototype,'$router',{get:function get(){return this.$root._router}});Object.defineProperty(Vue.prototype,'$route',{get:function get(){return this.$root._route}});var isDef=function(v){return v!==undefined;};var registerInstance=function(vm,callVal){var i=vm.$options._parentVnode;if(isDef(i)&&isDef(i=i.data)&&isDef(i=i.registerRouteInstance)){i(vm,callVal);}};Vue.mixin({beforeCreate:function beforeCreate(){if(isDef(this.$options.router)){this._router=this.$options.router;this._router.init(this);Vue.util.defineReactive(this,'_route',this._router.history.current);}
registerInstance(this,this);},destroyed:function destroyed(){registerInstance(this);}});Vue.component('router-view',View);Vue.component('router-link',Link);var strats=Vue.config.optionMergeStrategies;strats.beforeRouteEnter=strats.beforeRouteLeave=strats.created;}
var inBrowser=typeof window!=='undefined';function resolvePath(relative,base,append){var firstChar=relative.charAt(0);if(firstChar==='/'){return relative}
if(firstChar==='?'||firstChar==='#'){return base+relative}
var stack=base.split('/');if(!append||!stack[stack.length-1]){stack.pop();}
var segments=relative.replace(/^\//,'').split('/');for(var i=0;i<segments.length;i++){var segment=segments[i];if(segment==='..'){stack.pop();}else if(segment!=='.'){stack.push(segment);}}
if(stack[0]!==''){stack.unshift('');}
return stack.join('/')}
function parsePath(path){var hash='';var query='';var hashIndex=path.indexOf('#');if(hashIndex>=0){hash=path.slice(hashIndex);path=path.slice(0,hashIndex);}
var queryIndex=path.indexOf('?');if(queryIndex>=0){query=path.slice(queryIndex+1);path=path.slice(0,queryIndex);}
return{path:path,query:query,hash:hash}}
function cleanPath(path){return path.replace(/\/\//g,'/')}
function createRouteMap(routes,oldPathMap,oldNameMap){var pathMap=oldPathMap||Object.create(null);var nameMap=oldNameMap||Object.create(null);routes.forEach(function(route){addRouteRecord(pathMap,nameMap,route);});return{pathMap:pathMap,nameMap:nameMap}}
function addRouteRecord(pathMap,nameMap,route,parent,matchAs){var path=route.path;var name=route.name;{assert(path!=null,"\"path\" is required in a route configuration.");assert(typeof route.component!=='string',"route config \"component\" for path: "+(String(path||name))+" cannot be a "+
"string id. Use an actual component instead.");}
var record={path:normalizePath(path,parent),components:route.components||{default:route.component},instances:{},name:name,parent:parent,matchAs:matchAs,redirect:route.redirect,beforeEnter:route.beforeEnter,meta:route.meta||{},props:route.props==null?{}:route.components?route.props:{default:route.props}};if(route.children){{if(route.name&&route.children.some(function(child){return /^\/?$/.test(child.path);})){warn(false,"Named Route '"+(route.name)+"' has a default child route. "+
"When navigating to this named route (:to=\"{name: '"+(route.name)+"'\"), "+
"the default child route will not be rendered. Remove the name from "+
"this route and use the name of the default child route for named "+
"links instead.");}}
route.children.forEach(function(child){var childMatchAs=matchAs?cleanPath((matchAs+"/"+(child.path))):undefined;addRouteRecord(pathMap,nameMap,child,record,childMatchAs);});}
if(route.alias!==undefined){if(Array.isArray(route.alias)){route.alias.forEach(function(alias){var aliasRoute={path:alias,children:route.children};addRouteRecord(pathMap,nameMap,aliasRoute,parent,record.path);});}else{var aliasRoute={path:route.alias,children:route.children};addRouteRecord(pathMap,nameMap,aliasRoute,parent,record.path);}}
if(!pathMap[record.path]){pathMap[record.path]=record;}
if(name){if(!nameMap[name]){nameMap[name]=record;}else if("development"!=='production'&&!matchAs){warn(false,"Duplicate named routes definition: "+
"{ name: \""+name+"\", path: \""+(record.path)+"\" }");}}}
function normalizePath(path,parent){path=path.replace(/\/$/,'');if(path[0]==='/'){return path}
if(parent==null){return path}
return cleanPath(((parent.path)+"/"+path))}
var index$1=Array.isArray||function(arr){return Object.prototype.toString.call(arr)=='[object Array]';};var isarray=index$1;var index=pathToRegexp;var parse_1=parse;var compile_1=compile;var tokensToFunction_1=tokensToFunction;var tokensToRegExp_1=tokensToRegExp;var PATH_REGEXP=new RegExp(['(\\\\.)','([\\/.])?(?:(?:\\:(\\w+)(?:\\(((?:\\\\.|[^\\\\()])+)\\))?|\\(((?:\\\\.|[^\\\\()])+)\\))([+*?])?|(\\*))'].join('|'),'g');function parse(str,options){var tokens=[];var key=0;var index=0;var path='';var defaultDelimiter=options&&options.delimiter||'/';var res;while((res=PATH_REGEXP.exec(str))!=null){var m=res[0];var escaped=res[1];var offset=res.index;path+=str.slice(index,offset);index=offset+m.length;if(escaped){path+=escaped[1];continue}
var next=str[index];var prefix=res[2];var name=res[3];var capture=res[4];var group=res[5];var modifier=res[6];var asterisk=res[7];if(path){tokens.push(path);path='';}
var partial=prefix!=null&&next!=null&&next!==prefix;var repeat=modifier==='+'||modifier==='*';var optional=modifier==='?'||modifier==='*';var delimiter=res[2]||defaultDelimiter;var pattern=capture||group;tokens.push({name:name||key++,prefix:prefix||'',delimiter:delimiter,optional:optional,repeat:repeat,partial:partial,asterisk:!!asterisk,pattern:pattern?escapeGroup(pattern):(asterisk?'.*':'[^'+escapeString(delimiter)+']+?')});}
if(index<str.length){path+=str.substr(index);}
if(path){tokens.push(path);}
return tokens}
function compile(str,options){return tokensToFunction(parse(str,options))}
function encodeURIComponentPretty(str){return encodeURI(str).replace(/[\/?#]/g,function(c){return '%'+c.charCodeAt(0).toString(16).toUpperCase()})}
function encodeAsterisk(str){return encodeURI(str).replace(/[?#]/g,function(c){return '%'+c.charCodeAt(0).toString(16).toUpperCase()})}
function tokensToFunction(tokens){var matches=new Array(tokens.length);for(var i=0;i<tokens.length;i++){if(typeof tokens[i]==='object'){matches[i]=new RegExp('^(?:'+tokens[i].pattern+')$');}}
return function(obj,opts){var path='';var data=obj||{};var options=opts||{};var encode=options.pretty?encodeURIComponentPretty:encodeURIComponent;for(var i=0;i<tokens.length;i++){var token=tokens[i];if(typeof token==='string'){path+=token;continue}
var value=data[token.name];var segment;if(value==null){if(token.optional){if(token.partial){path+=token.prefix;}
continue}else{throw new TypeError('Expected "'+token.name+'" to be defined')}}
if(isarray(value)){if(!token.repeat){throw new TypeError('Expected "'+token.name+'" to not repeat, but received `'+JSON.stringify(value)+'`')}
if(value.length===0){if(token.optional){continue}else{throw new TypeError('Expected "'+token.name+'" to not be empty')}}
for(var j=0;j<value.length;j++){segment=encode(value[j]);if(!matches[i].test(segment)){throw new TypeError('Expected all "'+token.name+'" to match "'+token.pattern+'", but received `'+JSON.stringify(segment)+'`')}
path+=(j===0?token.prefix:token.delimiter)+segment;}
continue}
segment=token.asterisk?encodeAsterisk(value):encode(value);if(!matches[i].test(segment)){throw new TypeError('Expected "'+token.name+'" to match "'+token.pattern+'", but received "'+segment+'"')}
path+=token.prefix+segment;}
return path}}
function escapeString(str){return str.replace(/([.+*?=^!:${}()[\]|\/\\])/g,'\\$1')}
function escapeGroup(group){return group.replace(/([=!:$\/()])/g,'\\$1')}
function attachKeys(re,keys){re.keys=keys;return re}
function flags(options){return options.sensitive?'':'i'}
function regexpToRegexp(path,keys){var groups=path.source.match(/\((?!\?)/g);if(groups){for(var i=0;i<groups.length;i++){keys.push({name:i,prefix:null,delimiter:null,optional:false,repeat:false,partial:false,asterisk:false,pattern:null});}}
return attachKeys(path,keys)}
function arrayToRegexp(path,keys,options){var parts=[];for(var i=0;i<path.length;i++){parts.push(pathToRegexp(path[i],keys,options).source);}
var regexp=new RegExp('(?:'+parts.join('|')+')',flags(options));return attachKeys(regexp,keys)}
function stringToRegexp(path,keys,options){return tokensToRegExp(parse(path,options),keys,options)}
function tokensToRegExp(tokens,keys,options){if(!isarray(keys)){options=(keys||options);keys=[];}
options=options||{};var strict=options.strict;var end=options.end!==false;var route='';for(var i=0;i<tokens.length;i++){var token=tokens[i];if(typeof token==='string'){route+=escapeString(token);}else{var prefix=escapeString(token.prefix);var capture='(?:'+token.pattern+')';keys.push(token);if(token.repeat){capture+='(?:'+prefix+capture+')*';}
if(token.optional){if(!token.partial){capture='(?:'+prefix+'('+capture+'))?';}else{capture=prefix+'('+capture+')?';}}else{capture=prefix+'('+capture+')';}
route+=capture;}}
var delimiter=escapeString(options.delimiter||'/');var endsWithDelimiter=route.slice(-delimiter.length)===delimiter;if(!strict){route=(endsWithDelimiter?route.slice(0,-delimiter.length):route)+'(?:'+delimiter+'(?=$))?';}
if(end){route+='$';}else{route+=strict&&endsWithDelimiter?'':'(?='+delimiter+'|$)';}
return attachKeys(new RegExp('^'+route,flags(options)),keys)}
function pathToRegexp(path,keys,options){if(!isarray(keys)){options=(keys||options);keys=[];}
options=options||{};if(path instanceof RegExp){return regexpToRegexp(path,(keys))}
if(isarray(path)){return arrayToRegexp((path),(keys),options)}
return stringToRegexp((path),(keys),options)}
index.parse=parse_1;index.compile=compile_1;index.tokensToFunction=tokensToFunction_1;index.tokensToRegExp=tokensToRegExp_1;var regexpCache=Object.create(null);function getRouteRegex(path){var hit=regexpCache[path];var keys,regexp;if(hit){keys=hit.keys;regexp=hit.regexp;}else{keys=[];regexp=index(path,keys);regexpCache[path]={keys:keys,regexp:regexp};}
return{keys:keys,regexp:regexp}}
var regexpCompileCache=Object.create(null);function fillParams(path,params,routeMsg){try{var filler=regexpCompileCache[path]||(regexpCompileCache[path]=index.compile(path));return filler(params||{},{pretty:true})}catch(e){{warn(false,("missing param for "+routeMsg+": "+(e.message)));}
return ''}}
function normalizeLocation(raw,current,append,router){var next=typeof raw==='string'?{path:raw}:raw;if(next.name||next._normalized){return next}
if(!next.path&&next.params&&current){next=assign({},next);next._normalized=true;var params=assign(assign({},current.params),next.params);if(current.name){next.name=current.name;next.params=params;}else if(current.matched){var rawPath=current.matched[current.matched.length-1].path;next.path=fillParams(rawPath,params,("path "+(current.path)));}else{warn(false,"relative params navigation requires a current route.");}
return next}
var parsedPath=parsePath(next.path||'');var basePath=(current&&current.path)||'/';var path=parsedPath.path?resolvePath(parsedPath.path,basePath,append||next.append):(current&&current.path)||'/';var query=resolveQuery(parsedPath.query,next.query,router&&router.options.parseQuery);var hash=next.hash||parsedPath.hash;if(hash&&hash.charAt(0)!=='#'){hash="#"+hash;}
return{_normalized:true,path:path,query:query,hash:hash}}
function assign(a,b){for(var key in b){a[key]=b[key];}
return a}
function createMatcher(routes,router){var ref=createRouteMap(routes);var pathMap=ref.pathMap;var nameMap=ref.nameMap;function addRoutes(routes){createRouteMap(routes,pathMap,nameMap);}
function match(raw,currentRoute,redirectedFrom){var location=normalizeLocation(raw,currentRoute,false,router);var name=location.name;if(name){var record=nameMap[name];{warn(record,("Route with name '"+name+"' does not exist"));}
var paramNames=getRouteRegex(record.path).keys.filter(function(key){return!key.optional;}).map(function(key){return key.name;});if(typeof location.params!=='object'){location.params={};}
if(currentRoute&&typeof currentRoute.params==='object'){for(var key in currentRoute.params){if(!(key in location.params)&&paramNames.indexOf(key)>-1){location.params[key]=currentRoute.params[key];}}}
if(record){location.path=fillParams(record.path,location.params,("named route \""+name+"\""));return _createRoute(record,location,redirectedFrom)}}else if(location.path){location.params={};for(var path in pathMap){if(matchRoute(path,location.params,location.path)){return _createRoute(pathMap[path],location,redirectedFrom)}}}
return _createRoute(null,location)}
function redirect(record,location){var originalRedirect=record.redirect;var redirect=typeof originalRedirect==='function'?originalRedirect(createRoute(record,location,null,router)):originalRedirect;if(typeof redirect==='string'){redirect={path:redirect};}
if(!redirect||typeof redirect!=='object'){{warn(false,("invalid redirect option: "+(JSON.stringify(redirect))));}
return _createRoute(null,location)}
var re=redirect;var name=re.name;var path=re.path;var query=location.query;var hash=location.hash;var params=location.params;query=re.hasOwnProperty('query')?re.query:query;hash=re.hasOwnProperty('hash')?re.hash:hash;params=re.hasOwnProperty('params')?re.params:params;if(name){var targetRecord=nameMap[name];{assert(targetRecord,("redirect failed: named route \""+name+"\" not found."));}
return match({_normalized:true,name:name,query:query,hash:hash,params:params},undefined,location)}else if(path){var rawPath=resolveRecordPath(path,record);var resolvedPath=fillParams(rawPath,params,("redirect route with path \""+rawPath+"\""));return match({_normalized:true,path:resolvedPath,query:query,hash:hash},undefined,location)}else{{warn(false,("invalid redirect option: "+(JSON.stringify(redirect))));}
return _createRoute(null,location)}}
function alias(record,location,matchAs){var aliasedPath=fillParams(matchAs,location.params,("aliased route with path \""+matchAs+"\""));var aliasedMatch=match({_normalized:true,path:aliasedPath});if(aliasedMatch){var matched=aliasedMatch.matched;var aliasedRecord=matched[matched.length-1];location.params=aliasedMatch.params;return _createRoute(aliasedRecord,location)}
return _createRoute(null,location)}
function _createRoute(record,location,redirectedFrom){if(record&&record.redirect){return redirect(record,redirectedFrom||location)}
if(record&&record.matchAs){return alias(record,location,record.matchAs)}
return createRoute(record,location,redirectedFrom,router)}
return{match:match,addRoutes:addRoutes}}
function matchRoute(path,params,pathname){var ref=getRouteRegex(path);var regexp=ref.regexp;var keys=ref.keys;var m=pathname.match(regexp);if(!m){return false}else if(!params){return true}
for(var i=1,len=m.length;i<len;++i){var key=keys[i-1];var val=typeof m[i]==='string'?decodeURIComponent(m[i]):m[i];if(key){params[key.name]=val;}}
return true}
function resolveRecordPath(path,record){return resolvePath(path,record.parent?record.parent.path:'/',true)}
var positionStore=Object.create(null);function setupScroll(){window.addEventListener('popstate',function(e){saveScrollPosition();if(e.state&&e.state.key){setStateKey(e.state.key);}});}
function handleScroll(router,to,from,isPop){if(!router.app){return}
var behavior=router.options.scrollBehavior;if(!behavior){return}
{assert(typeof behavior==='function',"scrollBehavior must be a function");}
router.app.$nextTick(function(){var position=getScrollPosition();var shouldScroll=behavior(to,from,isPop?position:null);if(!shouldScroll){return}
var isObject=typeof shouldScroll==='object';if(isObject&&typeof shouldScroll.selector==='string'){var el=document.querySelector(shouldScroll.selector);if(el){position=getElementPosition(el);}else if(isValidPosition(shouldScroll)){position=normalizePosition(shouldScroll);}}else if(isObject&&isValidPosition(shouldScroll)){position=normalizePosition(shouldScroll);}
if(position){window.scrollTo(position.x,position.y);}});}
function saveScrollPosition(){var key=getStateKey();if(key){positionStore[key]={x:window.pageXOffset,y:window.pageYOffset};}}
function getScrollPosition(){var key=getStateKey();if(key){return positionStore[key]}}
function getElementPosition(el){var docEl=document.documentElement;var docRect=docEl.getBoundingClientRect();var elRect=el.getBoundingClientRect();return{x:elRect.left-docRect.left,y:elRect.top-docRect.top}}
function isValidPosition(obj){return isNumber(obj.x)||isNumber(obj.y)}
function normalizePosition(obj){return{x:isNumber(obj.x)?obj.x:window.pageXOffset,y:isNumber(obj.y)?obj.y:window.pageYOffset}}
function isNumber(v){return typeof v==='number'}
var supportsPushState=inBrowser&&(function(){var ua=window.navigator.userAgent;if((ua.indexOf('Android 2.')!==-1||ua.indexOf('Android 4.0')!==-1)&&ua.indexOf('Mobile Safari')!==-1&&ua.indexOf('Chrome')===-1&&ua.indexOf('Windows Phone')===-1){return false}
return window.history&&'pushState'in window.history})();var Time=inBrowser&&window.performance&&window.performance.now?window.performance:Date;var _key=genKey();function genKey(){return Time.now().toFixed(3)}
function getStateKey(){return _key}
function setStateKey(key){_key=key;}
function pushState(url,replace){saveScrollPosition();var history=window.history;try{if(replace){history.replaceState({key:_key},'',url);}else{_key=genKey();history.pushState({key:_key},'',url);}}catch(e){window.location[replace?'replace':'assign'](url);}}
function replaceState(url){pushState(url,true);}
function runQueue(queue,fn,cb){var step=function(index){if(index>=queue.length){cb();}else{if(queue[index]){fn(queue[index],function(){step(index+1);});}else{step(index+1);}}};step(0);}
var History=function History(router,base){this.router=router;this.base=normalizeBase(base);this.current=START;this.pending=null;this.ready=false;this.readyCbs=[];this.readyErrorCbs=[];this.errorCbs=[];};History.prototype.listen=function listen(cb){this.cb=cb;};History.prototype.onReady=function onReady(cb,errorCb){if(this.ready){cb();}else{this.readyCbs.push(cb);if(errorCb){this.readyErrorCbs.push(errorCb);}}};History.prototype.onError=function onError(errorCb){this.errorCbs.push(errorCb);};History.prototype.transitionTo=function transitionTo(location,onComplete,onAbort){var this$1=this;var route=this.router.match(location,this.current);this.confirmTransition(route,function(){this$1.updateRoute(route);onComplete&&onComplete(route);this$1.ensureURL();if(!this$1.ready){this$1.ready=true;this$1.readyCbs.forEach(function(cb){cb(route);});}},function(err){if(onAbort){onAbort(err);}
if(err&&!this$1.ready){this$1.ready=true;this$1.readyErrorCbs.forEach(function(cb){cb(err);});}});};History.prototype.confirmTransition=function confirmTransition(route,onComplete,onAbort){var this$1=this;var current=this.current;var abort=function(err){if(err instanceof Error){this$1.errorCbs.forEach(function(cb){cb(err);});}
onAbort&&onAbort(err);};if(isSameRoute(route,current)&&route.matched.length===current.matched.length){this.ensureURL();return abort()}
var ref=resolveQueue(this.current.matched,route.matched);var updated=ref.updated;var deactivated=ref.deactivated;var activated=ref.activated;var queue=[].concat(extractLeaveGuards(deactivated),this.router.beforeHooks,extractUpdateHooks(updated),activated.map(function(m){return m.beforeEnter;}),resolveAsyncComponents(activated));this.pending=route;var iterator=function(hook,next){if(this$1.pending!==route){return abort()}
try{hook(route,current,function(to){if(to===false||to instanceof Error){this$1.ensureURL(true);abort(to);}else if(typeof to==='string'||typeof to==='object'){abort();if(typeof to==='object'&&to.replace){this$1.replace(to);}else{this$1.push(to);}}else{next(to);}});}catch(e){abort(e);}};runQueue(queue,iterator,function(){var postEnterCbs=[];var isValid=function(){return this$1.current===route;};var enterGuards=extractEnterGuards(activated,postEnterCbs,isValid);runQueue(enterGuards,iterator,function(){if(this$1.pending!==route){return abort()}
this$1.pending=null;onComplete(route);if(this$1.router.app){this$1.router.app.$nextTick(function(){postEnterCbs.forEach(function(cb){cb();});});}});});};History.prototype.updateRoute=function updateRoute(route){var prev=this.current;this.current=route;this.cb&&this.cb(route);this.router.afterHooks.forEach(function(hook){hook&&hook(route,prev);});};function normalizeBase(base){if(!base){if(inBrowser){var baseEl=document.querySelector('base');base=(baseEl&&baseEl.getAttribute('href'))||'/';}else{base='/';}}
if(base.charAt(0)!=='/'){base='/'+base;}
return base.replace(/\/$/,'')}
function resolveQueue(current,next){var i;var max=Math.max(current.length,next.length);for(i=0;i<max;i++){if(current[i]!==next[i]){break}}
return{updated:next.slice(0,i),activated:next.slice(i),deactivated:current.slice(i)}}
function extractGuards(records,name,bind,reverse){var guards=flatMapComponents(records,function(def,instance,match,key){var guard=extractGuard(def,name);if(guard){return Array.isArray(guard)?guard.map(function(guard){return bind(guard,instance,match,key);}):bind(guard,instance,match,key)}});return flatten(reverse?guards.reverse():guards)}
function extractGuard(def,key){if(typeof def!=='function'){def=_Vue.extend(def);}
return def.options[key]}
function extractLeaveGuards(deactivated){return extractGuards(deactivated,'beforeRouteLeave',bindGuard,true)}
function extractUpdateHooks(updated){return extractGuards(updated,'beforeRouteUpdate',bindGuard)}
function bindGuard(guard,instance){return function boundRouteGuard(){return guard.apply(instance,arguments)}}
function extractEnterGuards(activated,cbs,isValid){return extractGuards(activated,'beforeRouteEnter',function(guard,_,match,key){return bindEnterGuard(guard,match,key,cbs,isValid)})}
function bindEnterGuard(guard,match,key,cbs,isValid){return function routeEnterGuard(to,from,next){return guard(to,from,function(cb){next(cb);if(typeof cb==='function'){cbs.push(function(){poll(cb,match.instances,key,isValid);});}})}}
function poll(cb,instances,key,isValid){if(instances[key]){cb(instances[key]);}else if(isValid()){setTimeout(function(){poll(cb,instances,key,isValid);},16);}}
function resolveAsyncComponents(matched){var _next;var pending=0;var error=null;flatMapComponents(matched,function(def,_,match,key){if(typeof def==='function'&&def.cid===undefined){pending++;var resolve=once(function(resolvedDef){def.resolved=typeof resolvedDef==='function'?resolvedDef:_Vue.extend(resolvedDef);match.components[key]=resolvedDef;pending--;if(pending<=0&&_next){_next();}});var reject=once(function(reason){var msg="Failed to resolve async component "+key+": "+reason;"development"!=='production'&&warn(false,msg);if(!error){error=reason instanceof Error?reason:new Error(msg);if(_next){_next(error);}}});var res;try{res=def(resolve,reject);}catch(e){reject(e);}
if(res){if(typeof res.then==='function'){res.then(resolve,reject);}else{var comp=res.component;if(comp&&typeof comp.then==='function'){comp.then(resolve,reject);}}}}});return function(to,from,next){if(error){next(error);}else if(pending<=0){next();}else{_next=next;}}}
function flatMapComponents(matched,fn){return flatten(matched.map(function(m){return Object.keys(m.components).map(function(key){return fn(m.components[key],m.instances[key],m,key);})}))}
function flatten(arr){return Array.prototype.concat.apply([],arr)}
function once(fn){var called=false;return function(){if(called){return}
called=true;return fn.apply(this,arguments)}}
var HTML5History=(function(History$$1){function HTML5History(router,base){var this$1=this;History$$1.call(this,router,base);var expectScroll=router.options.scrollBehavior;if(expectScroll){setupScroll();}
window.addEventListener('popstate',function(e){this$1.transitionTo(getLocation(this$1.base),function(route){if(expectScroll){handleScroll(router,route,this$1.current,true);}});});}
if(History$$1)HTML5History.__proto__=History$$1;HTML5History.prototype=Object.create(History$$1&&History$$1.prototype);HTML5History.prototype.constructor=HTML5History;HTML5History.prototype.go=function go(n){window.history.go(n);};HTML5History.prototype.push=function push(location,onComplete,onAbort){var this$1=this;var ref=this;var fromRoute=ref.current;this.transitionTo(location,function(route){pushState(cleanPath(this$1.base+route.fullPath));handleScroll(this$1.router,route,fromRoute,false);onComplete&&onComplete(route);},onAbort);};HTML5History.prototype.replace=function replace(location,onComplete,onAbort){var this$1=this;var ref=this;var fromRoute=ref.current;this.transitionTo(location,function(route){replaceState(cleanPath(this$1.base+route.fullPath));handleScroll(this$1.router,route,fromRoute,false);onComplete&&onComplete(route);},onAbort);};HTML5History.prototype.ensureURL=function ensureURL(push){if(getLocation(this.base)!==this.current.fullPath){var current=cleanPath(this.base+this.current.fullPath);push?pushState(current):replaceState(current);}};HTML5History.prototype.getCurrentLocation=function getCurrentLocation(){return getLocation(this.base)};return HTML5History;}(History));function getLocation(base){var path=window.location.pathname;if(base&&path.indexOf(base)===0){path=path.slice(base.length);}
return(path||'/')+window.location.search+window.location.hash}
var HashHistory=(function(History$$1){function HashHistory(router,base,fallback){History$$1.call(this,router,base);if(fallback&&checkFallback(this.base)){return}
ensureSlash();}
if(History$$1)HashHistory.__proto__=History$$1;HashHistory.prototype=Object.create(History$$1&&History$$1.prototype);HashHistory.prototype.constructor=HashHistory;HashHistory.prototype.setupListeners=function setupListeners(){var this$1=this;window.addEventListener('hashchange',function(){if(!ensureSlash()){return}
this$1.transitionTo(getHash(),function(route){replaceHash(route.fullPath);});});};HashHistory.prototype.push=function push(location,onComplete,onAbort){this.transitionTo(location,function(route){pushHash(route.fullPath);onComplete&&onComplete(route);},onAbort);};HashHistory.prototype.replace=function replace(location,onComplete,onAbort){this.transitionTo(location,function(route){replaceHash(route.fullPath);onComplete&&onComplete(route);},onAbort);};HashHistory.prototype.go=function go(n){window.history.go(n);};HashHistory.prototype.ensureURL=function ensureURL(push){var current=this.current.fullPath;if(getHash()!==current){push?pushHash(current):replaceHash(current);}};HashHistory.prototype.getCurrentLocation=function getCurrentLocation(){return getHash()};return HashHistory;}(History));function checkFallback(base){var location=getLocation(base);if(!/^\/#/.test(location)){window.location.replace(cleanPath(base+'/#'+location));return true}}
function ensureSlash(){var path=getHash();if(path.charAt(0)==='/'){return true}
replaceHash('/'+path);return false}
function getHash(){var href=window.location.href;var index=href.indexOf('#');return index===-1?'':href.slice(index+1)}
function pushHash(path){window.location.hash=path;}
function replaceHash(path){var i=window.location.href.indexOf('#');window.location.replace(window.location.href.slice(0,i>=0?i:0)+'#'+path);}
var AbstractHistory=(function(History$$1){function AbstractHistory(router,base){History$$1.call(this,router,base);this.stack=[];this.index=-1;}
if(History$$1)AbstractHistory.__proto__=History$$1;AbstractHistory.prototype=Object.create(History$$1&&History$$1.prototype);AbstractHistory.prototype.constructor=AbstractHistory;AbstractHistory.prototype.push=function push(location,onComplete,onAbort){var this$1=this;this.transitionTo(location,function(route){this$1.stack=this$1.stack.slice(0,this$1.index+1).concat(route);this$1.index++;onComplete&&onComplete(route);},onAbort);};AbstractHistory.prototype.replace=function replace(location,onComplete,onAbort){var this$1=this;this.transitionTo(location,function(route){this$1.stack=this$1.stack.slice(0,this$1.index).concat(route);onComplete&&onComplete(route);},onAbort);};AbstractHistory.prototype.go=function go(n){var this$1=this;var targetIndex=this.index+n;if(targetIndex<0||targetIndex>=this.stack.length){return}
var route=this.stack[targetIndex];this.confirmTransition(route,function(){this$1.index=targetIndex;this$1.updateRoute(route);});};AbstractHistory.prototype.getCurrentLocation=function getCurrentLocation(){var current=this.stack[this.stack.length-1];return current?current.fullPath:'/'};AbstractHistory.prototype.ensureURL=function ensureURL(){};return AbstractHistory;}(History));var VueRouter=function VueRouter(options){if(options===void 0)options={};this.app=null;this.apps=[];this.options=options;this.beforeHooks=[];this.afterHooks=[];this.matcher=createMatcher(options.routes||[],this);var mode=options.mode||'hash';this.fallback=mode==='history'&&!supportsPushState;if(this.fallback){mode='hash';}
if(!inBrowser){mode='abstract';}
this.mode=mode;switch(mode){case 'history':this.history=new HTML5History(this,options.base);break
case 'hash':this.history=new HashHistory(this,options.base,this.fallback);break
case 'abstract':this.history=new AbstractHistory(this,options.base);break
default:{assert(false,("invalid mode: "+mode));}}};var prototypeAccessors={currentRoute:{}};VueRouter.prototype.match=function match(raw,current,redirectedFrom){return this.matcher.match(raw,current,redirectedFrom)};prototypeAccessors.currentRoute.get=function(){return this.history&&this.history.current};VueRouter.prototype.init=function init(app){var this$1=this;"development"!=='production'&&assert(install.installed,"not installed. Make sure to call `Vue.use(VueRouter)` "+
"before creating root instance.");this.apps.push(app);if(this.app){return}
this.app=app;var history=this.history;if(history instanceof HTML5History){history.transitionTo(history.getCurrentLocation());}else if(history instanceof HashHistory){var setupHashListener=function(){history.setupListeners();};history.transitionTo(history.getCurrentLocation(),setupHashListener,setupHashListener);}
history.listen(function(route){this$1.apps.forEach(function(app){app._route=route;});});};VueRouter.prototype.beforeEach=function beforeEach(fn){this.beforeHooks.push(fn);};VueRouter.prototype.afterEach=function afterEach(fn){this.afterHooks.push(fn);};VueRouter.prototype.onReady=function onReady(cb,errorCb){this.history.onReady(cb,errorCb);};VueRouter.prototype.onError=function onError(errorCb){this.history.onError(errorCb);};VueRouter.prototype.push=function push(location,onComplete,onAbort){this.history.push(location,onComplete,onAbort);};VueRouter.prototype.replace=function replace(location,onComplete,onAbort){this.history.replace(location,onComplete,onAbort);};VueRouter.prototype.go=function go(n){this.history.go(n);};VueRouter.prototype.back=function back(){this.go(-1);};VueRouter.prototype.forward=function forward(){this.go(1);};VueRouter.prototype.getMatchedComponents=function getMatchedComponents(to){var route=to?this.resolve(to).route:this.currentRoute;if(!route){return[]}
return[].concat.apply([],route.matched.map(function(m){return Object.keys(m.components).map(function(key){return m.components[key]})}))};VueRouter.prototype.resolve=function resolve(to,current,append){var location=normalizeLocation(to,current||this.history.current,append,this);var route=this.match(location,current);var fullPath=route.redirectedFrom||route.fullPath;var base=this.history.base;var href=createHref(base,fullPath,this.mode);return{location:location,route:route,href:href,normalizedTo:location,resolved:route}};VueRouter.prototype.addRoutes=function addRoutes(routes){this.matcher.addRoutes(routes);if(this.history.current!==START){this.history.transitionTo(this.history.getCurrentLocation());}};Object.defineProperties(VueRouter.prototype,prototypeAccessors);function createHref(base,fullPath,mode){var path=mode==='hash'?'#'+fullPath:fullPath;return base?cleanPath(base+'/'+path):path}
VueRouter.install=install;VueRouter.version='2.4.0';if(inBrowser&&window.Vue){window.Vue.use(VueRouter);}
return VueRouter;})));