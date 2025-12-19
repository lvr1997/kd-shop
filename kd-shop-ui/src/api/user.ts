import instance from "./request";
/**
 * 注册接口
 */
export function Register(data = {}) {
  return instance.request({
    method: "POST",
    url: "/register/",
    data,
  });
}

/** 登录 */
export function Login(data = {}) {
  return instance.request({
    method: "post",
    url: "/login/",
    data,
  });
}

/** 登出 */
export function Logout() {
  return instance.request({
    method: "post",
    url: "/logout/",
  });
}
