import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import "./index.css";
import { ToastContainer, toast } from "react-toastify";
import App from "./App.jsx";
import { BrowserRouter } from "react-router";
import Router from "./config/Router.jsx";

createRoot(document.getElementById("root")).render(
  <StrictMode>
    <BrowserRouter>
      <Router />
      <ToastContainer />
    </BrowserRouter>
  </StrictMode>
);
