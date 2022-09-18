export default http => ({
    async all(){
        console.log('api')
        let response = await http.get('products/all');
        return response.data;
    }
})