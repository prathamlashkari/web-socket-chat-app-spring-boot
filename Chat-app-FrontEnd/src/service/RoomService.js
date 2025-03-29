import { httpClient } from "../config/AxiosHelper";


export const createRoomApi = async (roomDetail) => {
  const respone = await httpClient.post(`/api/v1/rooms/create`, roomDetail, {
    headers: {
      "Content-Type": "text/plain",
    },
  });
  return respone.data;
};
