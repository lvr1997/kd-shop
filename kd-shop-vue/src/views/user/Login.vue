<template>
  <main>
    <!-- 登录 -->
    <section class="login-area pt-100 pb-100" ref="loginArea">
      <div class="container">
        <div class="row">
          <div class="col-lg-8 offset-lg-2">
            <div class="basic-login">
              <h3 class="text-center mb-60">登录</h3>
              <form action="#">
                <label for="loginAcc">手机号 <span>**</span></label>
                <input
                  id="loginAcc"
                  type="text"
                  placeholder="Enter Your Phone Number..."
                />
                <label for="loginPass">密码 <span>**</span></label>
                <input
                  id="loginPass"
                  type="password"
                  placeholder="Enter password..."
                />
                <div class="login-action mb-20 fix">
                  <span class="log-rem f-left">
                    <input id="remember" type="checkbox" />
                    <label for="remember">记住我！</label>
                  </span>
                  <span class="forgot-login f-right">
                    <a href="#">忘记密码？</a>
                  </span>
                </div>
                <button class="btn theme-btn-2 w-100">立即登录</button>
                <div class="or-divide"><span>或</span></div>
                <a class="btn theme-btn w-100" @click="toggleLoginOrRegister(1)"
                  >注册</a
                >
              </form>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!-- 登录 end -->
    <!-- 注册-->
    <section class="login-area pt-100 pb-100" ref="registerArea">
      <div class="container">
        <div class="row">
          <div class="col-lg-8 offset-lg-2">
            <div class="basic-login">
              <h3 class="text-center mb-60">注册</h3>
              <form action="#">
                <label for="name">用户名 <span>**</span></label>
                <input
                  id="name"
                  type="text"
                  placeholder="Enter Username to Login..."
                />
                <label for="phone-id">手机号<span>**</span></label>
                <input
                  id="phone-id"
                  type="text"
                  placeholder="Enter Your Phone Number..."
                />
                <label for="pass">密码 <span>**</span></label>
                <input
                  id="pass"
                  type="password"
                  placeholder="Enter password..."
                />
                <label for="confim_pass">确认密码 <span>**</span></label>
                <input
                  id="confim_pass"
                  type="password"
                  placeholder="Enter password again..."
                />
                <div class="row">
                  <div class="col-md-6">
                    <label for="verifyCode">验证码 <span>**</span></label>
                    <input
                      id="verifyCode"
                      type="text"
                      placeholder="请输入图片验证码"
                    />
                  </div>
                  <div class="col-md-6">
                    <img src="" alt="" />
                  </div>
                </div>
                <div class="mt-10"></div>
                <button class="btn theme-btn-2 w-100">立即注册</button>
                <div class="or-divide"><span>或</span></div>
                <a
                  class="btn theme-btn w-100"
                  @click="toggleLoginOrRegister('register')"
                  >登录</a
                >
              </form>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!-- 注册 End-->
  </main>
</template>

<script>
export default {
  data() {
    return {
      
    };
  },
  methods: {
    toggleLoginOrRegister(type) {
      if (type === 1) {
        this.$refs.loginArea.style.display = "none";
        this.$refs.registerArea.style.display = "block";
      } else {
        this.$refs.registerArea.style.display = "none";
        this.$refs.loginArea.style.display = "block";
      }
    },
  },
  components: {
  },
};
</script>

<style scoped>
.basic-login {
  padding: 90px;

  border: 2px solid #eaedff;
}

@media only screen and (min-width: 992px) and (max-width: 1200px) {
  .basic-login {
    padding: 50px;
  }
}

@media only screen and (min-width: 768px) and (max-width: 991px) {
  .basic-login {
    padding: 40px;
  }
}

@media (max-width: 767px) {
  .basic-login {
    padding: 30px;
  }
}

.basic-login h3 {
  font-size: 30px;
}

.basic-login input {
  width: 100%;

  height: 60px;

  border: 2px solid #eaedff;

  color: #6f7172;

  padding: 0 20px;

  margin-bottom: 20px;
}

.basic-login label {
  color: #222;

  display: block;
}

.basic-login label span {
  color: #fe4536;
}

.login-action input {
  width: inherit;

  height: auto;
}

.login-action label {
  display: inline-block;

  margin-left: 5px;
}

.or-divide {
  border-top: 2px solid #eaedff;

  margin: 40px 0;

  text-align: center;

  position: relative;
}

.or-divide span {
  position: absolute;

  left: 0;

  right: 0;

  top: -9px;

  background: #ffffff;

  display: inline-block;

  width: 40px;

  margin: auto;

  line-height: 1;

  font-weight: 500;
}

@media (max-width: 767px) {
  .forgot-login {
    float: none;
  }
}

.forgot-login a {
  color: #fe4536;
}

.forgot-login a:hover {
  color: #84b77c;
}

@media (max-width: 767px) {
  .log-rem {
    float: none;

    margin-bottom: 10px;

    display: block;
  }
}
</style>
