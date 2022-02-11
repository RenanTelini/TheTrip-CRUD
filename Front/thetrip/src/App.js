import React from "react";
import {BrowserRouter, Routes, Route} from "react-router-dom";
import Home from "./views/Home";
import Contatos from "./views/Contatos";
import Destinos from "./views/Destinos";
import Promocoes from "./views/Promocoes";
import Menu from "./components/Menu";
import Footer from "./components/Footer";

function App() {
  return (
    <BrowserRouter>
      <Menu />
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/Contatos" element={<Contatos/>} />
          <Route path="/Destinos" element={<Destinos />} />
          <Route path="/Promocoes" element={<Promocoes />} />
        </Routes>
        <Footer />
    </BrowserRouter>
  );
}

export default App;

// Exemplo de inserção de imagem: 
//import logo from './logo.svg';
//<img src={logo} className="App-logo" alt="logo" />