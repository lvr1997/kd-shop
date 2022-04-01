<template>
	<div class="content">
		<!-- preloader -->
		<transition name="preloader">
			<div id="preloader" v-if="show">
				<div class="preloader">
					<span></span>
					<span></span>
				</div>
			</div>
		</transition>
		<!-- preloader end  -->
		<div class="header--sidebar"></div>
		<HomeHeader></HomeHeader>
		<router-view/>
		<HomeFooter></HomeFooter>
	</div>
</template>

<script>
	import HomeHeader from '../components/HomeHeader'
	import HomeFooter from '../components/HomeFooter'
	export default {
		components:{
			HomeHeader,
			HomeFooter
		},
		data() {
			return {
				show: true,
			}
		},
		mounted() {
			this.show = false;
		}
	}

	// window.onload = () => {
	// 	$('#preloader').delay(350).fadeOut('slow');
	// 	$('body').delay(350).css({ 'overflow': 'visible' });
	// }
</script>

<style>
  @import url("../assets/css/css.css");
 @import url("../assets/css/bootstrap.min1.css");
 @import url("../assets/css/reset.css");
 @import url("../assets/css/default1.css");
 @import url("../assets/css/responsive1.css");

.box-90{
	padding-left: 90px;
	padding-right: 90px;
}

.box-105{
	padding-left: 105px;
	padding-right: 105px;
}

 /*--- preloader ---*/
.dark #preloader {
  background-color: #232323;
}

#preloader {
  position: fixed;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  background-color: #f7f7f7;
  z-index: 999999;
}

.preloader {
  width: 50px;
  height: 50px;
  display: inline-block;
  padding: 0px;
  text-align: left;
  box-sizing: border-box;
  position: absolute;
  top: 50%;
  left: 50%;
  margin-left: -25px;
  margin-top: -25px;
}

.preloader span {
  position: absolute;
  display: inline-block;
  width: 50px;
  height: 50px;
  border-radius: 100%;
  background: #fe4536;
  -webkit-animation: preloader 1.3s linear infinite;
  animation: preloader 1.3s linear infinite;
}

.preloader span:last-child {
  animation-delay: -0.8s;
  -webkit-animation-delay: -0.8s;
}

@keyframes preloader {
  0% {
    transform: scale(0, 0);
    opacity: 0.5;
  }
  100% {
    transform: scale(1, 1);
    opacity: 0;
  }
}

@-webkit-keyframes preloader {
  0% {
    -webkit-transform: scale(0, 0);
    opacity: 0.5;
  }
  100% {
    -webkit-transform: scale(1, 1);
    opacity: 0;
  }
}
/*--- end of preloader ---*/
</style>
