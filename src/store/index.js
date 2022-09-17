import { createStore } from 'vuex';
import createCartStore from '@/store/cart';
import createProductStore from '@/store/product'

export default () => createStore({
  modules: {
    cart: createCartStore(),
    product: createProductStore(),
  },
  strict: process.env.NODE_ENV !== 'production'
})

