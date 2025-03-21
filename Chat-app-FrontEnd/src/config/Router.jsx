import React from "react";
import { BrowserRouter, Routes, Route } from "react-router";
import App from "../App.jsx";
import JoinCreateChat from "../component/JoinCreateChat.jsx";
const Router = () => {
  return (
    <Routes>
      <Route path="/" element={<App />} />
      <Route path="/chat" element={<JoinCreateChat />} />
    </Routes>
  );
};

export default Router;
