import React from "react";
import {Link} from "react-router-dom";

export default function Menu(){
    return (
        
        <nav id="navmenu">
            <Link to="/" id="thetrip">TheTrip</Link>
            <Link to="/" id="menu">Home</Link>
            <Link to="/Contatos" id="menu">Contatos</Link>
            <Link to="/Destinos" id="menu">Destinos</Link>
            <Link to="/Promocoes" id="menu">Promoções</Link>
        </nav>
    )
}