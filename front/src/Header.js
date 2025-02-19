import React, { useState, useEffect } from 'react';
import { useNavigate } from 'react-router-dom';

const Header = () => {
    const navigate = useNavigate();
    const [message, setMessage] = useState('');

    useEffect(() => {
        const messages = [
            "Welcome to our Animal Shelter! Here you will find the best friends waiting for a new chance.",
            "Help us find the perfect home for our animals!",
            "Discover the love you're looking for - adopt today!",
            "Life is better with a friend – give an animal a chance.",
            "Join our team and help animals find the love they deserve.",
            "Every donation helps animals receive the care they need.",
            "Meet our beloved friends who are waiting for a home.",
            "Every animal has a unique story. We invite you to learn it!"
        ];

        const messageInterval = setInterval(() => {
            const randomMessage = messages[Math.floor(Math.random() * messages.length)];
            setMessage(randomMessage);
        }, 5000);

        return () => clearInterval(messageInterval);
    }, []);

    return (
        <header style={{ padding: '50px 0', textAlign: 'center', backgroundColor: '#1E2A47', color: 'white' }}>
            <div>
                <h1>Animal Shelter</h1>
                <p>{message}</p>
                <div>
                    <button style={styles.button}>Login</button>
                    <button style={styles.button} onClick={() => navigate('/signup')}>Sign Up</button>
                </div>
            </div>
        </header>
    );
};

const styles = {
    button: {
        backgroundColor: 'rgba(255, 255, 255, 0.7)',
        color: '#333',
        border: 'none',
        padding: '10px 20px',
        fontSize: '16px',
        cursor: 'pointer',
        borderRadius: '5px',
        margin: '10px',
        transition: 'background-color 0.3s',
    },
};

export default Header;
