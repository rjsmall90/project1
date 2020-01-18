import React, { Component } from 'react';
import axios from 'axios'; 


export  class Registration extends Component {

    state= {
        firstName: '',
        lastName: '',
        email: '',
        password: '',
        schoolName: '',
    };

    handleChange = event => {
        this.setState({
            firstName: event.target.value, 
            lastName: event.target.value, 
            email: event.target.value, 
            password: event.target.value, 
            schoolName: event.target.value 
        })
    };

    handleSubmit = event => {
        event.preventDefault(); 

        const user = {
            firstName: this.state.firstName,
            lastName: this.state.lastName, 
            email: this.state.email, 
            password: this.state.password, 
            schoolName: this.state.schoolName,  

        }

        axios.post('http://localhost:8080/user_profile/add_user', { user })
        .then(response => { 
            console.log(response);
            console.log(response.data); 
         }); 
    }

    

    render(){
        return (
            <div>
                <form onSubmit={this.handleSubmit}>
                    <label>
                        First Name:
                        <input type="text" name="firstName" onChange={this.handleChange}/>
                    </label>
                    <label>
                        Last Name:
                        <input type="text" name="lastName" onChange={this.handleChange}/>
                    </label>
                    <label>
                        E-mail:
                        <input type="text" name="email" onChange={this.handleChange}/>
                    </label>
                    <label>
                        Password:
                        <input type="text" name="password" onChange={this.handleChange}/>
                    </label>
                    <label>
                        School Name:
                        <input type="text" name="schoolName" onChange={this.handleChange}/>
                    </label>
                    <button type="submit">Register</button>
                </form>
            </div>
        ); 
    }

}

export default Registration; 
