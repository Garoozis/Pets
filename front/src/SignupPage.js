// src/SignUp.js
import React, { useState } from 'react';
import axios from 'axios';
import './SignUp.css';  // Εισαγωγή του CSS αρχείου

const SignUp = () => {
    const [userType, setUserType] = useState('Citizen');
    const [name, setName] = useState('');
    const [surname, setSurname] = useState('');
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [street, setStreet] = useState('');
    const [number, setNumber] = useState('');
    const [postalCode, setPostalCode] = useState('');
    const [area, setArea] = useState('');
    const [contactPhone, setContactPhone] = useState('');

    const handleSubmit = async (e) => {
        e.preventDefault();

        // Δημιουργία αντικειμένου με τα δεδομένα
        const userData = {
            name,
            surname,
            email,
            password,
            street,
            number,
            postalCode,
            area,
            contactPhone
        };

        try {
            // Ανάλογα με τον τύπο χρήστη, στέλνουμε τα δεδομένα στο σωστό endpoint
            const response = await axios.post('http://localhost:8080/public/users/signup', userData);

            // Μπορείς να κάνεις κάτι με την απάντηση (π.χ. redirect, εμφάνιση μηνύματος κτλ)
            console.log('User successfully registered:', response.data);
        } catch (error) {
            console.error('Error during registration:', error);
        }
    };

    return (
        <div className="signup-container">
            <h2>Sign Up</h2>
            <form onSubmit={handleSubmit}>
                <div className="form-group">
                    <label htmlFor="userType">User Type</label>
                    <select
                        id="userType"
                        value={userType}
                        onChange={(e) => setUserType(e.target.value)}
                    >
                        <option value="Citizen">Citizen</option>
                        <option value="Shelter">Shelter</option>
                        <option value="Veterinarian">Veterinarian</option>
                    </select>
                </div>

                {userType === 'Citizen' && (
                    <>
                        <div className="form-group">
                            <label htmlFor="name">Name</label>
                            <input
                                type="text"
                                id="name"
                                value={name}
                                onChange={(e) => setName(e.target.value)}
                            />
                        </div>
                        <div className="form-group">
                            <label htmlFor="surname">Surname</label>
                            <input
                                type="text"
                                id="surname"
                                value={surname}
                                onChange={(e) => setSurname(e.target.value)}
                            />
                        </div>
                        <div className="form-group">
                            <label htmlFor="email">Email</label>
                            <input
                                type="email"
                                id="email"
                                value={email}
                                onChange={(e) => setEmail(e.target.value)}
                            />
                        </div>
                        <div className="form-group">
                            <label htmlFor="password">Password</label>
                            <input
                                type="password"
                                id="password"
                                value={password}
                                onChange={(e) => setPassword(e.target.value)}
                            />
                        </div>
                    </>
                )}

                {userType === 'Shelter' && (
                    <>
                        <div className="form-group">
                            <label htmlFor="name">Name</label>
                            <input
                                type="text"
                                id="name"
                                value={name}
                                onChange={(e) => setName(e.target.value)}
                            />
                        </div>
                        <div className="form-group">
                            <label htmlFor="street">Street</label>
                            <input
                                type="text"
                                id="street"
                                value={street}
                                onChange={(e) => setStreet(e.target.value)}
                            />
                        </div>
                        <div className="form-group">
                            <label htmlFor="number">Number</label>
                            <input
                                type="text"
                                id="number"
                                value={number}
                                onChange={(e) => setNumber(e.target.value)}
                            />
                        </div>
                        <div className="form-group">
                            <label htmlFor="postalCode">Postal Code</label>
                            <input
                                type="text"
                                id="postalCode"
                                value={postalCode}
                                onChange={(e) => setPostalCode(e.target.value)}
                            />
                        </div>
                        <div className="form-group">
                            <label htmlFor="area">Area</label>
                            <input
                                type="text"
                                id="area"
                                value={area}
                                onChange={(e) => setArea(e.target.value)}
                            />
                        </div>
                        <div className="form-group">
                            <label htmlFor="contactPhone">Contact Phone</label>
                            <input
                                type="text"
                                id="contactPhone"
                                value={contactPhone}
                                onChange={(e) => setContactPhone(e.target.value)}
                            />
                        </div>
                        <div className="form-group">
                            <label htmlFor="email">Email</label>
                            <input
                                type="email"
                                id="email"
                                value={email}
                                onChange={(e) => setEmail(e.target.value)}
                            />
                        </div>
                    </>
                )}

                {userType === 'Veterinarian' && (
                    <>
                        <div className="form-group">
                            <label htmlFor="name">Name</label>
                            <input
                                type="text"
                                id="name"
                                value={name}
                                onChange={(e) => setName(e.target.value)}
                            />
                        </div>
                        <div className="form-group">
                            <label htmlFor="surname">Surname</label>
                            <input
                                type="text"
                                id="surname"
                                value={surname}
                                onChange={(e) => setSurname(e.target.value)}
                            />
                        </div>
                        <div className="form-group">
                            <label htmlFor="email">Email</label>
                            <input
                                type="email"
                                id="email"
                                value={email}
                                onChange={(e) => setEmail(e.target.value)}
                            />
                        </div>
                        <div className="form-group">
                            <label htmlFor="password">Password</label>
                            <input
                                type="password"
                                id="password"
                                value={password}
                                onChange={(e) => setPassword(e.target.value)}
                            />
                        </div>
                    </>
                )}

                <button type="submit">Submit</button>
            </form>
        </div>
    );
};

export default SignUp;
