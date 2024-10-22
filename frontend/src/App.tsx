import React from 'react';
import { Route, BrowserRouter as Router, Routes } from 'react-router-dom';
import './App.css';
import Home from './pages/home/Home';

const Product: React.FC = () => <div>Product</div>;

const App: React.FC = () => {
    return (
        <Router>
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/product" element={<Product />} />
            </Routes>
        </Router>
    );
};

export default App;
