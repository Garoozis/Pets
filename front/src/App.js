import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Header from './Header';
import SignupPage from './SignupPage';
// eslint-disable-next-line
import 'bootstrap/dist/css/bootstrap.min.css';


function App() {
    return (
        <Router>
            <Routes>
                <Route path="/" element={<Header />} />
                <Route path="/signup" element={<SignupPage />} />

            </Routes>
        </Router>
    );
}

export default App;
