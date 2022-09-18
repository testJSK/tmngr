import { createApp } from 'vue';
import App from '@/App.vue';
import createHttp from '@/plugins/http';
import createStore from '@/store';
import createRouter from '@/router';

export default () => {
    const http = createHttp()
    const store = createStore();
    const router = createRouter();

    createApp(App)
        .use(store)
        .use(router)
        .mount('#app')

}