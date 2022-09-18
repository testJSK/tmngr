export default productsApi => ({
    namespaced: true,
    state: {
        items: null
    },
    getters: {
        items: state => state.items,
    },
    mutations: {
        set(state, products){
            state.items = products;
        }
    },
    actions: {
        async load({ commit }){
            console.log('actions')
            const  products = await productsApi.all();
            commit('set', products);
        }
    },
})
