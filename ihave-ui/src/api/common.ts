import instance from "./request";
/**
 * 获取验证码
 */
export function GetCode(data: any) {
  return instance.request({
    method: "POST",
    url: "/getCode/",
    data,
  });
}

/**
 * http状态码异常演示接口
 */
export function ErrorHttp(data: any) {
  return instance.request({
    method: "POST",
    url: "/error/",
    data,
  });
}
