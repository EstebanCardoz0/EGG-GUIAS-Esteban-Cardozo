import React from "react";

export const Footer = () => {
  return (
    <div className="container">
      <footer className="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
        <p className="col-md-4 mb-0 text-muted">&copy; 2022 Company, Inc</p>

        <span className="col-md-4 d- align-items-center mb-3 mb-md-0 me-md-auto">
          <img
            className="App-logo"
            height="52"
            src="\Users\Usuario\Documents\CARPETA PARA NO BORRAR\EGG-GUIAS-Esteban-Cardozo\GUIA 20 - REACT\React prueba\mascotap\perrito.png"

          />


        </span>





        <ul className="nav col-md-4 justify-content-end">
          <li className="nav-item">
            <a href="#" className="nav-link px-2 text-muted">
              Home
            </a>
          </li>
          <li className="nav-item">
            <a href="#" className="nav-link px-2 text-muted">
              Features
            </a>
          </li>
          <li className="nav-item">
            <a href="#" className="nav-link px-2 text-muted">
              Pricing
            </a>
          </li>
          <li className="nav-item">
            <a href="#" className="nav-link px-2 text-muted">
              FAQs
            </a>
          </li>
          <li className="nav-item">
            <a href="#" className="nav-link px-2 text-muted">
              About
            </a>
          </li>
        </ul>
      </footer>
    </div>
  );
};