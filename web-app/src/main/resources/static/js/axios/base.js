/**
 * 使用axios请求后台 配置
 */
(function (win) {
    var Request = axios.create({
        timeout: 10000
    })

    Request.defaults.baseURL = getContextPath()

    Request.interceptors.request.use((config) => {
        console.log(config);
        return config;
    })

    Request.interceptors.response.use((response) => {
        console.log(response);
        return response;
    }, (err) => {
        console.log(err);
        return err;
    })

    win.$request = Request

})(window)

/**
 * 获取工程上下文路径
 * @returns
 */
function getContextPath() {
    var pathName = document.location.pathname;
    var index = pathName.substr(1).indexOf("/");
    var result = pathName.substr(0, index + 1);
    return result;
}