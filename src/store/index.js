import { createStore } from 'vuex';
import createCartStore from '@/store/cart';
import createProductStore from '@/store/product'

export default api => createStore({
  modules: {
    cart: createCartStore(api.cart),
    product: createProductStore(api.products),
  },
  strict: process.env.NODE_ENV !== 'production'
})

