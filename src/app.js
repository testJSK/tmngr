import { createApp } from 'vue'
import App from '@/App.vue'
import createStore from '@/store'
import createRouter from '@/router'

export default () => {
    const store = createStore();
    const router = createRouter();

    createApp(App)
        .use(store)
        .use(router)
        .mount('#app')

}