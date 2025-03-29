import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import "./index.css";
import { Toaster } from "react-hot-toast";
import { BrowserRouter } from "react-router";
import Router from "./config/Router.jsx";
import AppRoutes from "./config/Router.jsx";
import { ChatProvider } from "./context/ChatContext.jsx";

createRoot(document.getElementById("root")).render(
  <StrictMode>
    <BrowserRouter>
      <Toaster position="top-center" />
      <ChatProvider>
        <AppRoutes />
      </ChatProvider>
    </BrowserRouter>
  </StrictMode>
);
