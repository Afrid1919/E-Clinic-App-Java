/**
 * JavaScript file for Appointment HTML file
 */
 
    var doctorObject = {
                    "Psychologist": { 
                    "Dr. Mukesh Thapa": ["7:00 AM", "3:00 PM"],
                    "Dr. Sumesh Magar": ["6:30 AM", "4:00 PM"],
                    "Dr. Rupesh Adhikari": ["5:30 AM", "4:30 PM"],
                    },
                    "Neurologist": {
                    "Dr. Samar Ghimire": ["7:00 AM", "3:00 PM"],
                    "Dr. Dipesh Dhakal": ["5:30 AM", "5:00 PM"]
                    }, 
                    "Gynecologist": {
                    "Dr. Dipak Lamsal": ["6:30 AM", "5:00 PM"],
                    "Dr. Ganesh Karki": ["7:00 AM", "5:00 PM"]
                    },
                    }
         window.onload = function () {
                        var selectFieldList = document.getElementById("selectFieldList"),
                        selectDoctorList = document.getElementById("selectDoctorList"),
                        selectTimeList = document.getElementById("selectTimeList");
                        for (var doctorName in doctorObject) {
                            selectFieldList.options[selectFieldList.options.length] = new Option(doctorName, doctorName);
                        }
                        selectFieldList.onchange = function () {
                            selectDoctorList.length = 1; 
                            selectTimeList.length = 1; 
                            if (this.selectedIndex < 1) return; 
                            for (var fieldOfWork in doctorObject[this.value]) {
                                selectDoctorList.options[selectDoctorList.options.length] = new Option(fieldOfWork, fieldOfWork);
                            }
                        }
                        selectFieldList.onchange();
                        selectDoctorList.onchange = function () {
                            selectTimeList.length = 1; 
                            if (this.selectedIndex < 1) return; 
                            var docTime = doctorObject[selectFieldList.value][this.value];
                            for (var i = 0; i < docTime.length; i++) {
                                selectTimeList.options[selectTimeList.options.length] = new Option(docTime[i], docTime[i]);
                            }
                        }
                    }