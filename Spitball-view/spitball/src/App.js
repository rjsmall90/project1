import React from 'react';
import logo from './logo.svg';
import './App.css';

import UserRegistration from './component/user/userRegistration';
import User from './component/user/user'; 
import Schools from './component/schools/schools';

function App() {
  return (
    <div className="App">
        <img src={logo} className="App-logo" alt="logo" />
      <UserRegistration />
      {/* <User />  */}
      <Schools /> 
    </div>
  );
}

export default App;
