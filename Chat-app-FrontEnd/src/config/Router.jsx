import React from "react";
import { BrowserRouter, Routes, Route } from "react-router";
import App from "../App.jsx";
import JoinCreateChat from "../component/JoinCreateChat.jsx";
import ChatPage from "../component/ChatPage.jsx";
const Router = () => {
  return (
    <Routes>
      <Route path="/" element={<JoinCreateChat />} />
      <Route path="/chat" element={<ChatPage />} />
    </Routes>
  );
};

export default Router;
