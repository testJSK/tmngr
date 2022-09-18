import axios from "axios";
import createCartApi from '@/api/cart';
import createProductApi from '@/api/products';

export default () => {
    const http = axios.create({
        // baseURL: 'http://localhost:8080/api/',
        baseURL: 'http://faceprog.ru/reactcourseapi/',
        timeout: 10000,
    });

    const api = {
        cart: createCartApi(http),
        product: createProductApi(http),
    }

    return { http, api };
}