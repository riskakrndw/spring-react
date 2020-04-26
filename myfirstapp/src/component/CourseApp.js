import React, { Component } from 'react';
import ListCoursesComponent from './ListCoursesComponent';

class CourseApp extends Component{
    render(){
        return(
            <>
                <h1>Course Application</h1>
                <ListCoursesComponent/>
            </> //JSX fragment <> .... </>
        )
    }
}

export default CourseApp