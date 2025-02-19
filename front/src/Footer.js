// src/Footer.js
import React from 'react';

const Footer = () => {
    return (
        <footer style={footerStyle}>
            <p>© 2025 Animal Shelter. All rights reserved.</p>
            <p>Follow us on social media!</p>
        </footer>
    );
};

const footerStyle = {
    textAlign: 'center',
    padding: '20px 0',
    backgroundColor: '#333',
    color: 'white',
};

export default Footer;
