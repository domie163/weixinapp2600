const base = {
    get() {
        return {
            url : "http://localhost:8080/xiangcuenzhengwufuwu/",
            name: "xiangcuenzhengwufuwu",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xiangcuenzhengwufuwu/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "乡村政务服务系统"
        } 
    }
}
export default base
