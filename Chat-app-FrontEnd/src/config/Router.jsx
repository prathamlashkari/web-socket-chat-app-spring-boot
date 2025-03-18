import React from "react";
import { BrowserRouter, Routes, Route } from "react-router";
import App from "../App.jsx";
const Router = () => {
  return (
    <Routes>
      <Route path="/" element={<App />} />
      <Route path="/chat" element={<h1>This is chat app</h1>} />
    </Routes>
  );
};

export default Router;
