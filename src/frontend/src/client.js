import fetch from 'unfetch';

const checkStatus = response => {
    if (response.ok) {
        return response;
    }
    const error = new Error(response.statusText);
    error.response = response;
    return Promise.reject(error);
}
//fetch api from controller and send it to app.js
//http request
export const getAllStudents = () =>
    fetch("api/v1/students")
        .then(checkStatus);