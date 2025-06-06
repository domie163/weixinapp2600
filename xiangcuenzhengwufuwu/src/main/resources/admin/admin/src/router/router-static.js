import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import chat from '@/views/modules/chat/list'
    import dictionary from '@/views/modules/dictionary/list'
    import fupinzhengce from '@/views/modules/fupinzhengce/list'
    import news from '@/views/modules/news/list'
    import xiangmu from '@/views/modules/xiangmu/list'
    import xiangmuCollection from '@/views/modules/xiangmuCollection/list'
    import xiangmuCommentback from '@/views/modules/xiangmuCommentback/list'
    import yonghu from '@/views/modules/yonghu/list'
    import yuyuexiangmu from '@/views/modules/yuyuexiangmu/list'
    import zaixianshenbao from '@/views/modules/zaixianshenbao/list'
    import config from '@/views/modules/config/list'
    import dictionaryChat from '@/views/modules/dictionaryChat/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryXiangmu from '@/views/modules/dictionaryXiangmu/list'
    import dictionaryXiangmuCollection from '@/views/modules/dictionaryXiangmuCollection/list'
    import dictionaryYonghu from '@/views/modules/dictionaryYonghu/list'
    import dictionaryYuyuexiangmuYesno from '@/views/modules/dictionaryYuyuexiangmuYesno/list'
    import dictionaryZaixianshenbao from '@/views/modules/dictionaryZaixianshenbao/list'
    import dictionaryZaixianshenbaoYesno from '@/views/modules/dictionaryZaixianshenbaoYesno/list'
    import dictionaryZhuangtai from '@/views/modules/dictionaryZhuangtai/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryChat',
        name: '数据类型',
        component: dictionaryChat
    }
    ,{
        path: '/dictionaryNews',
        name: '社区风采类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryXiangmu',
        name: '项目类型',
        component: dictionaryXiangmu
    }
    ,{
        path: '/dictionaryXiangmuCollection',
        name: '收藏表类型',
        component: dictionaryXiangmuCollection
    }
    ,{
        path: '/dictionaryYonghu',
        name: '家庭状况',
        component: dictionaryYonghu
    }
    ,{
        path: '/dictionaryYuyuexiangmuYesno',
        name: '预约结果',
        component: dictionaryYuyuexiangmuYesno
    }
    ,{
        path: '/dictionaryZaixianshenbao',
        name: '服务类型',
        component: dictionaryZaixianshenbao
    }
    ,{
        path: '/dictionaryZaixianshenbaoYesno',
        name: '申报结果',
        component: dictionaryZaixianshenbaoYesno
    }
    ,{
        path: '/dictionaryZhuangtai',
        name: '状态',
        component: dictionaryZhuangtai
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/chat',
        name: '政民互动',
        component: chat
      }
    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/fupinzhengce',
        name: '扶贫政策',
        component: fupinzhengce
      }
    ,{
        path: '/news',
        name: '社区风采',
        component: news
      }
    ,{
        path: '/xiangmu',
        name: '预约项目',
        component: xiangmu
      }
    ,{
        path: '/xiangmuCollection',
        name: '预约项目收藏',
        component: xiangmuCollection
      }
    ,{
        path: '/xiangmuCommentback',
        name: '预约评价',
        component: xiangmuCommentback
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }
    ,{
        path: '/yuyuexiangmu',
        name: '我的预约',
        component: yuyuexiangmu
      }
    ,{
        path: '/zaixianshenbao',
        name: '我的预约',
        component: zaixianshenbao
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
