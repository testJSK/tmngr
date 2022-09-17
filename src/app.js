import { createApp } from 'vue'
import App from './App.vue'

import createRouter from './router'
import store from './store'



export default () => {
    const router = createRouter();

    createApp(App)
        .use(store)
        .use(router)
        .mount('#app')

}