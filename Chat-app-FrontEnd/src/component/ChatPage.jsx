import React from "react";

const ChatPage = () => {
  return (
    <div className="">
      {" "}
      {/* this is a header */}
      <header className="dark:border-gray-700  fixed w-full dark:bg-gray-900 py-5 shadow flex justify-around items-center">
        {/* room name container */}
        <div>
          <h1 className="text-xl font-semibold">
            {/* Room : <span>{roomId}</span> */}
          </h1>
        </div>
        {/* username container */}

        <div>
          <h1 className="text-xl font-semibold">
            {/* User : <span>{currentUser}</span> */}
          </h1>
        </div>
        {/* button: leave room */}
        <div>
          <button
            // onClick={handleLogout}
            className="dark:bg-red-500 dark:hover:bg-red-700 px-3 py-2 rounded-full"
          >
            Leave Room
          </button>
        </div>
      </header>
    </div>
  );
};

export default ChatPage;
