function showCourses() {
    fetch("http://localhost:8080/courses")
        .then((response) => response.json())
        .then((courses) => {
            const datatable = document.getElementById("coursetable");

            courses.forEach(course => {
                const row = `
                    <tr>
                        <td>${course.courseId}</td>
                        <td>${course.courseName}</td>
                        <td>${course.trainer}</td>
                        <td>${course.duration}</td>
                    </tr>`;
                datatable.innerHTML += row;
            });
        })
        .catch(error => console.error("Error fetching courses:", error));
}
function showenrolledstudents() {
    fetch("http://localhost:8080/courses/enrolled")
        .then((response) => response.json())
        .then((students) => {
            const datatable = document.getElementById("enrolledtable");

            students.forEach(student => {
                const row = `
                    <tr>
                        <td>${student.name}</td>
                        <td>${student.emailId}</td>
                        <td>${student.courseName}</td>
                      
                    </tr>`;
                datatable.innerHTML += row;
            });
        })
        .catch(error => console.error("Error fetching courses:", error));
}
