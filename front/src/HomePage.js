import React from 'react';
import Header from './Header';  // Εισάγουμε το Header

const HomePage = () => {
    return (
        <div>
            <Header />  {/* Τοποθετούμε το Header με τα μηνύματα στην αρχή της σελίδας */}
            <main style={mainContent}>
                <h2>Welcome!</h2>
                <p>Επιλέξτε αν θέλετε να συνδεθείτε ή να εγγραφείτε.</p>
            </main>

            {/* Footer */}
            <footer style={footerStyle}>
                <p>&copy; 2025 Animal Shelter. All rights reserved.</p>
                <p>Follow us on social media!</p>
            </footer>
        </div>
    );
};

// Στυλ για το περιεχόμενο της σελίδας
const mainContent = {
    padding: '20px',
    textAlign: 'center',
    backgroundColor: '#f4f4f4',  // Απαλό χρώμα φόντου για το κύριο περιεχόμενο
    color: '#333',  // Σκούρο κείμενο για καλύτερη ανάγνωση
};

// Στυλ για το footer
const footerStyle = {
    padding: '20px',
    textAlign: 'center',
    backgroundColor: '#333',  // Σκούρο φόντο για το footer
    color: 'white',  // Λευκό κείμενο για αντίθεση
    position: 'fixed',  // Κάνει το footer να είναι πάντα στο κάτω μέρος της σελίδας
    width: '100%',
    bottom: 0,
};

export default HomePage;
