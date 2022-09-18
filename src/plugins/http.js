import axios from "axios";

export default () => {
    const http = axios.create({
        baseURL: 'http://localhost:8080/api/',
        timeout: 10000,
    });
    return http;
}