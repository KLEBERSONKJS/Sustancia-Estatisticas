function toggleEdit(id) {
    const view = document.getElementById("view-" + id);
    const edit = document.getElementById("edit-" + id);

    const isVisible = edit.style.display === "block";
    edit.style.display = isVisible ? "none" : "block";
    view.style.display = isVisible ? "block" : "none";
}