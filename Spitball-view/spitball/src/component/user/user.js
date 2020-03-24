import React, { Component } from 'react';
import axios from 'axios'; 

export class User extends Component {
    state = {
        users: [], 
    }; 

    componentDidMount() {
        axios.get('https').then(response => { console.log(response);
        this.setState({ users: response.data })});
    }


    render() {
        return(
            <div>
                <ul>
                    {this.state.users.map(user => (
                        <li key={user.id}>{user.name}</li>
                    ))}
                </ul>
            </div>
        )
        
    }

}; 

export default User;