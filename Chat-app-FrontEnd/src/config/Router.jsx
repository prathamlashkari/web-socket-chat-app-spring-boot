import React from "react";
import { BrowserRouter, Routes, Route } from "react-router";
import App from "../App.jsx";
import JoinCreateChat from "../component/JoinCreateChat.jsx";
const Router = () => {
  return (
    <Routes>
      <Route path="/" element={<JoinCreateChat />} />
      <Route path="/chat" element={<h1>This is chat page</h1>} />
    </Routes>
  );
};

export default Router;
