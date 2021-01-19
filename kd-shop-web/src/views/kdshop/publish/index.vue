<template>
  <div>
    <home-header></home-header>
    <div class="publish">
      <page-header :page-title="pageTitle" />
      <div class="form-body">
        <el-upload
          :on-preview="handlePictureCardPreview"
          :on-remove="handleRemove"
          :on-success="handleUploadSuccess"
          action="kd-shop.oss-cn-beijing.aliyuncs.com"
          :data="dataObj"
          :multiple="false"
          list-type="picture-card"
          :before-upload="beforeUpload"
        >
          <i class="el-icon-plus" />
          <div slot="tip" class="el-upload__tip">只能上传jpg/png文件，且不超过10MB</div>
        </el-upload>
        <el-dialog :visible.sync="dialogVisible">
          <img :src="dialogImageUrl" width="100%" alt="" />
        </el-dialog>
        <!-- 填写表单 -->
        <el-form
          ref="publishForm"
          :model="publishForm"
          :rules="rules"
          label-width="100px"
          class="demo-ruleForm"
        >
          <el-form-item label="学校名称" prop="schoolName">
            <el-input
              v-model="publishForm.schoolName"
              :disabled="true"
              class="form-input"
            >黑龙江科技大学</el-input
            >
          </el-form-item>
          <el-form-item label="闲置分类" prop="catelogId">
            <el-select
              v-model="publishForm.catelogId"
              placeholder="请选择闲置分类"
            >
              <el-option label="书籍" value="1" />
              <el-option label="数码" value="2" />
            </el-select>
          </el-form-item>
          <el-form-item label="闲置名称" prop="name">
            <el-input
              v-model="publishForm.name"
              class="form-input"
              maxlength="14"
              show-word-limit
            />
          </el-form-item>
          <el-form-item label="闲置描述" prop="describle">
            <el-input
              v-model="publishForm.describle"
              class="form-input long-input"
              type="textarea"
            />
          </el-form-item>
          <el-form-item label="价格" prop="price">
            <el-input
              v-model="publishForm.price"
              oninput="value=value.replace(/[^0-9.]/g,'')"
              class="form-input short-input"
            />
          </el-form-item>
          <el-form-item label="原价" prop="realPrice">
            <el-input
              v-model="publishForm.realPrice"
              oninput="value=value.replace(/[^0-9.]/g,'')"
              class="form-input short-input"
            />
            <el-button class="price-btn" size="mini" icon="el-icon-circle-plus"
                       @click="showBuyUrl"
                       v-show="!buyUrlStatus"
            >添加原购买链接</el-button>
          </el-form-item>
          <el-form-item label="原购买链接" prop="buyUrl" v-show="buyUrlStatus">
            <el-input
              v-model="publishForm.buyUrl"
              class="form-input long-input"
            />
          </el-form-item>
          <el-form-item label="交易方式" prop="buyMethod">
            <el-radio-group v-model="publishForm.buyMethod">
              <el-radio :label="1">线上</el-radio>
              <el-radio :label="2">线下</el-radio>
              <el-radio :label="3">线上/线下</el-radio>
            </el-radio-group>
          </el-form-item>
          <el-form-item label="交易地址" prop="address">
            <el-input
              v-model="publishForm.address"
              class="form-input long-input"
            />
          </el-form-item>
          <el-form-item label="联系方式" prop="phoneNumber">
            <el-input
              v-model="publishForm.phoneNumber"
              class="form-input"
              placeholder="请输入手机号"
            />
          </el-form-item>
          <el-form-item class="form-btns">
            <el-button type="primary" @click="submitForm('publishForm')"
            >立即发布</el-button
            >
            <el-button type="warning">暂存</el-button>
            <el-button type="info" plain @click="resetForm('publishForm')"
            >重置</el-button
            >
          </el-form-item>
        </el-form>
      </div>
    </div>
    <home-footer></home-footer>
  </div>
</template>

<script>
import HomeHeader from '@/components/HomeHeader'
import HomeFooter from '@/components/HomeFooter'
import PageHeader from '@/components/PageHeader'
import { upload } from "@/api/kdshop/upload";

export default {
  components: {
    HomeHeader,
    HomeFooter,
    PageHeader
  },
  data () {
    const validateMoney = (rule,value,callback) =>{
      if(!value){
        callback(new Error('价格不能为空'))
      }else if(value.indexOf(".") != -1 && value.split('.').length > 2){
        callback(new Error('请输入正确格式的金额')) //防止输入多个小数点
      }else if(value.indexOf(".") != -1 && value.split('.')[1].length > 2){
        callback(new Error('请输入正确的小数位数')) //小数点后两位
      }else{
        callback();
      }
    };
    var validatorPhone = function (rule, value, callback) {
      if (value === '') {
        callback(new Error('手机号不能为空'))
      } else if (!/^1\d{10}$/.test(value)) {
        callback(new Error('手机号格式错误'))
      } else {
        callback()
      }
    };
    return {
      pageTitle: '闲置发布',
      dialogImageUrl: '',
      dialogVisible: false,
      buyUrlStatus: false,
      dataObj: {
        policy: '',
        signature: '',
        key: '',
        accessKeyId: '',
        filePath: '',
        host: ''
      },
      publishForm: {
        schoolName: '',
        catelogId: '',
        name: '',
        describle: '',
        price: 0.00,
        realPrice: 0.00,
        buyUrl: '',
        buyMethod: 1,
        address: '',
        phoneNumber: ''
      },
      rules: {
        name: [
          { required: true, message: '请输入闲置名称', trigger: 'blur' },
          { min: 5, max: 14, message: '长度在 5 - 14个字符', trigger: 'blur' }
        ],
        catelogId: [
          { required: true, message: '请选择闲置分类', trigger: 'change' }
        ],
        describle: [
          { required: true, message: '请输入闲置描述', trigger: 'blur' },
          { min: 5, message: '最少输入5个字符', trigger: 'blur' }
        ],
        price: [
          { type: 'string', required: true, trigger: 'blur', validator: validateMoney }
        ],
        realPrice: [
          { type: 'string', required: true, trigger: 'blur', validator: validateMoney}
        ],
        address: [
          { required: true, message: '请输入交易地址', trigger: 'blur' }
        ],
        phoneNumber: [ // 需要自定义规则
          { required: true, trigger: 'blur', validator: validatorPhone }
        ]
      }
    }
  },
  methods: {
    showBuyUrl(){
      this.buyUrlStatus = true
    },
    // 上传之前请求的方法
    beforeUpload(file) {
      let _self = this
      return new Promise(((resolve, reject) => {
        upload(file).then(response => {
          console.log("uploadPolicy...", response)
          _self.dataObj.policy = response.data.policy;
          _self.dataObj.signature = response.data.signature;
          _self.dataObj.accessKeyId = response.data.accessKeyId;
          _self.dataObj.key = response.data.filePath + response.data.uuid +'_${filename}';
          _self.dataObj.dir = response.data.filePath;
          _self.dataObj.host = response.data.host;
          console.log("policy...", this.dataObj)
        })
      }))
    },
    handleRemove (file, fileList) {
      console.log(file, fileList)
    },
    handlePictureCardPreview (file) {
      this.dialogImageUrl = file.url
      this.dialogVisible = true
    },
    handleUploadSuccess(res, file) {
      console.log("上传成功...")
      this.showFileList = true;
      this.fileList.pop();
      this.fileList.push({name: file.name, url: this.dataObj.host + '/' + this.dataObj.key.replace("${filename}",file.name) });
      this.emitInput(this.fileList[0].url);
    },
    submitForm (formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          alert('submit!')
        } else {
          console.log('error submit!!')
          return false
        }
      })
    },
    resetForm (formName) {
      this.$refs[formName].resetFields()
    }
  }
}
</script>

<style lang="scss" scoped>
.publish {
  width: 1200px;
  margin: 15px auto;
  .form-body {
    margin-top: 7px;
    text-align: center;
    background-color: #fff;
    padding: 15px 50px;
    text-align: center;
  }
  .demo-ruleForm {
    margin-top: 18px;
    text-align: left;
    .form-input {
      width: 300px;
    }
    .long-input {
      width: 500px;
    }
    .short-input {
      width: 80px;
    }
  }
}
.form-btns {
  margin-top: 40px;
}
.price-btn {
  margin-left: 15px;
}
</style>
