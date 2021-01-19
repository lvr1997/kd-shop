<template>
    <el-page-header class="page-header" @back="goBack" :content="pageTitle"></el-page-header>
</template>

<script>
export default {
    props: {
        pageTitle: {
            type: String,
            default: ''
        }
    },
    data() {
        return {

        }
    },
    methods: {
        goBack() {
            this.$router.go(-1)
        }
    }
}
</script>

<style lang="scss" scoped>
.page-header {
    margin: 0 auto;
    margin-top: 15px;
    background-color: #ffffff;
    color: #409EFF;
    height: 40px;
    line-height: 40px;
    padding-left: 8px;
}
::v-deep .el-page-header__content {
    font-size: 14px;
    color: rgb(110, 107, 114);
}
</style>
