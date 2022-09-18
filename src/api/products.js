export default http => ({
    async all(){
        console.log('api')
        let response = await http.get('/api/products/all');
        return response.data;
    }
})