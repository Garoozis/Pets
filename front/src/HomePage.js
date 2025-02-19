import React from 'react';
import Header from './Header';  // ��������� �� Header

const HomePage = () => {
    return (
        <div>
            <Header />  {/* ����������� �� Header �� �� �������� ���� ���� ��� ������� */}
            <main style={mainContent}>
                <h2>Welcome!</h2>
                <p>�������� �� ������ �� ���������� � �� ����������.</p>
            </main>

            {/* Footer */}
            <footer style={footerStyle}>
                <p>&copy; 2025 Animal Shelter. All rights reserved.</p>
                <p>Follow us on social media!</p>
            </footer>
        </div>
    );
};

// ���� ��� �� ����������� ��� �������
const mainContent = {
    padding: '20px',
    textAlign: 'center',
    backgroundColor: '#f4f4f4',  // ����� ����� ������ ��� �� ����� �����������
    color: '#333',  // ������ ������� ��� �������� ��������
};

// ���� ��� �� footer
const footerStyle = {
    padding: '20px',
    textAlign: 'center',
    backgroundColor: '#333',  // ������ ����� ��� �� footer
    color: 'white',  // ����� ������� ��� ��������
    position: 'fixed',  // ����� �� footer �� ����� ����� ��� ���� ����� ��� �������
    width: '100%',
    bottom: 0,
};

export default HomePage;
