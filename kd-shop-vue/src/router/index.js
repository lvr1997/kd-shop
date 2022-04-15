
import { createRouter, createWebHistory } from 'vue-router'

import Layout from '@/layout/Layout'
import NotFoundPage from '@/views/errorPage/notFound'

const routes = [
	{
		path: '/',
		component: Layout,
		redirect: '/home',
		children: [{
			path: '/login',
			name: 'Login',
			component: () => import('@/views/user/Login')
		},{
			path: '/home',
			name: 'Home',
			component: () => import('@/views/home/index'),
			meta: {
				index: 0
			}
		},
		{
			path: '/news',
			name: 'News',
			component: () => import('@/views/news/index'),
			meta: {
				index: 1
			}
		},
		{
			path: '/shop',
			name: 'Shop',
			component: () => import('@/views/shop/index'),
			meta: {
				index: 2
			}
		},
		{
			path: '/about',
			name: 'About',
			component: () => import('@/views/about/index'),
			meta: {
				index: 3
			}
		},
		{
			path: '/wishlist',
			name: 'Wishlist',
			component: () => import('@/views/wish/wishList')
		},
		{
			path: '/goods/publish',
			name: 'Publish',
			component: () => import('@/views/goods/publish')
		},
		{
			path: '/goods/detail',
			name: 'GoodDetail',
			component: () => import('@/views/goods/detail')
		},
		{
			path: '/goods/listing',
			name: 'GoodListing',
			component: () => import('@/views/goods/listing'),
			meta: {
				index: 4
			}
		},{
			path: '/checkout',
			name: 'Checkout',
			component: () => import('@/views/checkout/checkout')
		}]
	},


	//404页面
	{
		path: '/404',
		name: 'NotFoundPage',
		component: NotFoundPage
	}
]

const router = createRouter({
	mode: 'history',
	history: createWebHistory(process.env.BASE_URL),
	routes
})

router.beforeEach((to, from, next) => {
	if(to.matched.length === 0) {
		next('/404')
	} else {
		next()
	}
})

export default router
