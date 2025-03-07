
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import LostreportLostReportManager from "./components/listers/LostreportLostReportCards"
import LostreportLostReportDetail from "./components/listers/LostreportLostReportDetail"

import InsuranceInsuranceManager from "./components/listers/InsuranceInsuranceCards"
import InsuranceInsuranceDetail from "./components/listers/InsuranceInsuranceDetail"

import NotificationNotificationHistoryManager from "./components/listers/NotificationNotificationHistoryCards"
import NotificationNotificationHistoryDetail from "./components/listers/NotificationNotificationHistoryDetail"

import MobileBlockDeviceManager from "./components/listers/MobileBlockDeviceCards"
import MobileBlockDeviceDetail from "./components/listers/MobileBlockDeviceDetail"
import MobileRestrictNetworkManager from "./components/listers/MobileRestrictNetworkCards"
import MobileRestrictNetworkDetail from "./components/listers/MobileRestrictNetworkDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/lostreports/lostReports',
                name: 'LostreportLostReportManager',
                component: LostreportLostReportManager
            },
            {
                path: '/lostreports/lostReports/:id',
                name: 'LostreportLostReportDetail',
                component: LostreportLostReportDetail
            },

            {
                path: '/insurances/insurances',
                name: 'InsuranceInsuranceManager',
                component: InsuranceInsuranceManager
            },
            {
                path: '/insurances/insurances/:id',
                name: 'InsuranceInsuranceDetail',
                component: InsuranceInsuranceDetail
            },

            {
                path: '/notifications/notificationHistories',
                name: 'NotificationNotificationHistoryManager',
                component: NotificationNotificationHistoryManager
            },
            {
                path: '/notifications/notificationHistories/:id',
                name: 'NotificationNotificationHistoryDetail',
                component: NotificationNotificationHistoryDetail
            },

            {
                path: '/mobiles/blockDevices',
                name: 'MobileBlockDeviceManager',
                component: MobileBlockDeviceManager
            },
            {
                path: '/mobiles/blockDevices/:id',
                name: 'MobileBlockDeviceDetail',
                component: MobileBlockDeviceDetail
            },
            {
                path: '/mobiles/restrictNetworks',
                name: 'MobileRestrictNetworkManager',
                component: MobileRestrictNetworkManager
            },
            {
                path: '/mobiles/restrictNetworks/:id',
                name: 'MobileRestrictNetworkDetail',
                component: MobileRestrictNetworkDetail
            },



    ]
})
