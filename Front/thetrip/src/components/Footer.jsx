import React from "react";
import {Link} from "react-router-dom";

export default function Footer(){
    return (
        <>
        <footer id="roda-pé" className="border-top footer text-muted">
            <div className="container">
                &copy; 2022 - <Link to="/">TheTrip</Link>
            </div>
        </footer>
        </>
    )
}