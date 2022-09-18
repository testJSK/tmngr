export default http => ({
    async all(){
        let response = await http.get('products/all');
        return response.data;
    }
})