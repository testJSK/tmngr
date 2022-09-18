export default http => ({
    async load(){
        let response = await http.get('users/all');
        return response.data;
    },
    async add(token, id){
        let response = await http.post('users');
        return response.data;
    }

})