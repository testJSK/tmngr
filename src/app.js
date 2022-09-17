import { createApp } from 'vue'
import App from './App.vue'

import createRouter from '@/router'
import createStore from '@/store'

export default () => {
    const router = createRouter();
    const store = createStore();

    createApp(App)
        .use(store)
        .use(router)
        .mount('#app')

}