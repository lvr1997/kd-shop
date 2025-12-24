/**
 * 校验规则
 */
const regEmail = /^([a-zA-Z]|[0-9])(\w|\-)+@[a-zA-Z0-9]+\.([a-zA-Z]{2,4})$/;
const regPhone = /^1[3|4|5|6|7|8|9][0-9]\d{8}$/;
const reg_username = /^[a-zA-Z][a-zA-Z0-9]{4,15}$/;
const regPassword = /^(?!\D+$)(?![^a-zA-Z]+$)\S{6,20}$/;
const regCode = /^[a-z0-9]{6}$/;

// 校验手机号
export const validate_phone = (value: string) : boolean => regPhone.test(value);

//校验邮箱
export const validate_email = (value: string) : boolean => regEmail.test(value);

// 校验密码
export const validate_password = (value: string) : boolean => regPassword.test(value);

// 校验验证码
export const validate_code = (value: any) : boolean => regCode.test(value);
