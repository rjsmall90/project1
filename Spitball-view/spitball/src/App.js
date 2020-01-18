import React from 'react';
import logo from './logo.svg';
import './App.css';

import Registration from './component/registration/registration';
import User from './component/user/user'; 

function App() {
  return (
    <div className="App">
        <img src={logo} className="App-logo" alt="logo" />
      <Registration />
      <User /> 
    </div>
  );
}

export default App;
