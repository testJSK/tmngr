export default http => ({
    async all(){
        console.log('api')
        let response = await http.get('products/all');
        // let response = await http.get('products/all.php');
        return response.data;
    }
})

